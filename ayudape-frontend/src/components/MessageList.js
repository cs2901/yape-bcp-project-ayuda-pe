import React from 'react'
import '../style.css'
import Message from './Message'
import PropTypes from 'prop-types';

const MessageList = (props) => {
    let messages = props.messages;
  return (
    <div className="message-list">
        { messages.map((message, index) => {
            return (
              <Message key={index} text={message.text} sender={message.sender} source={message.source}/>
            )
        })}
    </div>
  )
};

MessageList.propTypes = {
    messages: PropTypes.array.isRequired
};

export default MessageList;
