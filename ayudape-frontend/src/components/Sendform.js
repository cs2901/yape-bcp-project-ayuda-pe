import React from 'react'
import PropTypes from 'prop-types'
import sendImage from '../images/Send.png'
import '../style.css'


const Sendform = (props) => {
    console.log("form: ",props)
      return (
        <div>
        <form className="send-message-form">
        <input placeholder = "¿Qué quieres saber?" type = "text" onChange={(e)=>{props.onUserInputChange(e)}} value={props.userInput}/>
          <button type="submit" onClick={props.send}>
          <img src={sendImage} alt="Send Message" height="40" width="40"/>
          </button>
        </form>
        </div>
      )
}

Sendform.propTypes = {
  userInput:PropTypes.string.isRequired,
  send:PropTypes.func.isRequired,
  onUserInputChange:PropTypes.func.isRequired
}
export default Sendform
