import React from 'react'
import profile from '../images/Bot.png'
import '../style.css'
import { getEvent } from '../endpoints'
import Message from './Message'
import styled, { css } from 'styled-components';

class MessageList extends React.Component {
    state = {
      messages: this.props.messages
    }
    render() {
      const messages = this.state.messages;
      console.log("messages: ",messages)
      return (
        <div className="message-list">
            { messages.map((message, index) => {
                return (
                  <Message text={message.text} sender={message.sender}/>
                )
            })}
        </div>
      )
    }
}
export default MessageList;
