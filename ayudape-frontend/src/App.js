import React from 'react'
import MessageList from './components/MessageList'
import Header from './components/Header'
import Sendform from './components/Sendform'
import {sendMessage} from './endpoints'

const TEST_DATA = [
    {
        date: '8:30',
        sender: false,
        text: 'Hola soy AyudaPe! Tu asistente personal de Yape.'
    },
    {
        date: '8:31',
        sender:true,
        text: 'Habla causa'
    },
    {
        date: '8:32',
        sender:false,
        text: '¿Qué necesitas saber?'
    },
    {
        date: '8:32',
        sender:true,
        text: 'que haces?'
    }
]

class App extends React.Component {
    state = {
      userInput: "",
      messages: TEST_DATA
    };
    handleSendMessage = async() => {
      const newMessage = {text:this.state.userInput,sender:true,date:'9:00'};
      let _messages = this.state.messages;
      _messages.push(newMessage);
        try{
            let r = await sendMessage(newMessage);
            console.log("try");
        }
        catch(e){
            console.log(e);
        }
      await this.setState(s => {
        return({
          ...s,
          userInput: "",
          messages: _messages
        });
      }, () => {console.log("state", this.state);});
    };

    handleUserInputChange = (input) => {
        if(this.state.userInput === "" && input.trim().length === 0) return;
      this.setState(s => {
        return({
          ...s,
          userInput: input
        })
      })
    };

    render() {
        return (
            <div className="app">
                <Header />
                <MessageList messages={this.state.messages}/>
                <Sendform onUserInputChange={this.handleUserInputChange} userInput={this.state.userInput} send={this.handleSendMessage}/>
            </div>
        );
    }
}

export default App
