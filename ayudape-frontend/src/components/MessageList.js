import React from 'react'
import profile from '../images/Bot.png'
import '../style.css'
import { getEvent } from '../endpoints'

const TEST_DATA = [
    {
        date: '8:30',
        text: 'Hola soy AyudaPe! Tu asistente personal de Yape.'
    },
    {
        date: '8:31',
        text: 'Habla causa'
    },
    {
        date: '8:32',
        text: '¿Qué necesitas saber?'
    },
    {
        date: '8:32',
        text: 'que haces?'
    }
]

class MessageList extends React.Component {

  componentDidMount() {
    this.handleGetEvent(55);
  }

  handleGetEvent = async (event) => {
    try {
      const { data } = await getEvent(event);
      resolve(data);
    } catch(error) {
      console.log("error", error)
    }
  }

    render() {
      return (
        <div className="message-list">
            {TEST_DATA.map((message, index) => {
                return (
                    <div className="message">
                    <div className="message-time">{message.date}</div>
                        <img src={profile} alt="Profile Pic" height="40" width="40"/>
                        <div className="message-text">{message.text}</div>
                    </div>
                )
            })}
        </div>
      )
    }
}
export default MessageList;
