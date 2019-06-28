import React from 'react'
import '../style.css'
import Message from './Message'
import PropTypes from 'prop-types'
import lifecycle from 'react-pure-lifecycle';

let messagesEnd;
const scrollToBottom = () => {
  messagesEnd.scrollIntoView({ behavior: "smooth"});
}

const methods = {
  componentDidUpdate(props) {
    setTimeout(scrollToBottom,750);
  }
};

const MessageList = (props) => {
    let messages = props.messages;
    return (
      <div className="message-list">
        { messages.map((message, index) => {
            console.log(message)
            return (
              <div>
              <Message key={index} text={message.text} sender={message.sender} source={message.source} handler={()=>{message.handler()}}/>
              <div ref={(el) => { messagesEnd = el; }}></div>
              </div>
            )
        })}
    </div>
  )
};

MessageList.propTypes = {
    messages: PropTypes.array.isRequired
};

export default lifecycle(methods)(MessageList);
