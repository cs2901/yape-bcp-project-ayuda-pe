import React from 'react'
import '../style.css'

class Sendform extends React.Component{
    render(){
      return (
        <form className="send-message-form">
        <input
          placeholder = "¿Qué quieres saber?"
          type = "text"/>
        </form>
      )
    }
}

export default Sendform
