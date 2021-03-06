import React from 'react'
import MessageList from './components/MessageList'
import Header from './components/Header'
import Sendform from './components/Sendform'
import {sendMessage} from './endpoints'
import { hotjar } from 'react-hotjar';
hotjar.initialize(1380357, 6);

class App extends React.Component {
    state = {
      userInput: "",
      messages: []
    };
    handleSendMessage = async() => {
      if(this.state.userInput.trim().length === 0) return;
      const newMessage = {text:this.state.userInput,sender:true,date:'9:00',handler:()=>{}};
      let _messages = this.state.messages;
      _messages.push(newMessage);
      let chatbotMessages;
        try{
            let r = await sendMessage(newMessage.text);
            const data = r.data.output.generic;
            chatbotMessages = data.map(message =>
                new Object({
                    date: '8:30',
                    sender: false,
                    text: message.text,
                    source: message.source,
                    handler: message.text ? message.text.charAt(0)==='+'? () => {this.handleButtonClick(message.text)}:() => {console.log("esto no es un boton")} : () => {console.log("no es mensaje")}
                })
            );
        } catch(e){
            console.log(e);
        } finally {
            this.setState(s => {
                let _messages_ = _messages.concat(chatbotMessages);
                return({
                    ...s,
                    userInput: "",
                    messages: _messages_
                });
            });
        }
    };

    handleButtonClick = async (text) => {
      this.setState(s => {
        return({
          ...s,
          userInput: text.substr(1)
        })
      },() => this.handleSendMessage())
    }

    handleUserInputChange = (input) => {
        if(this.state.userInput === "" && input.trim().length === 0) return;
      this.setState(s => {
        return({
          ...s,
          userInput: input
        })
      })
    };

    componentDidMount(){
      this.setState(s => {
        return({
          ...s,
          messages:[{text:"¡Hey que tal Yapero! Soy AyudaPe tu asistente personal de Yape, escríbeme sobre cualquier pregunta que tengas.",sender:false,handler:()=>{}}]
        })
      })
    }

    render() {
        return (
            <div className="app">
                <Header/>
                  <MessageList messages={this.state.messages}/>
                  <Sendform onUserInputChange={this.handleUserInputChange} userInput={this.state.userInput} send={this.handleSendMessage}/>
            </div>
        );
    }
}

export default App
