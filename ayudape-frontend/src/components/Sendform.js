import React from 'react'
import PropTypes from 'prop-types'
import sendImage from '../images/Send.png'
import '../style.css'
import styled from 'styled-components';

const Input = styled.input`
    width: 80%;
    margin: 0 20px;
    border-style: solid;
    border-color: inherit;
    background: var(--send-message-form);
    font-weight: 500;
`;

const Wrapper = styled.div`
  display: flex;
  padding: 40px;
`;

const Button = styled.button`
  height: 50%
`;

const Sendform = (props) => {
      return (
        <Wrapper>
        <Input placeholder = "¿Qué quieres saber?" type = "text" onChange={(e)=>{props.onUserInputChange(e.target.value)}} value={props.userInput}/>
            <Button type="button" onClick={props.send}>
          <img src={sendImage} alt="Send Message" height="40" width="40"/>
          </Button>
        </Wrapper>
      )
};

Sendform.propTypes = {
  userInput:PropTypes.string.isRequired,
  send:PropTypes.func.isRequired,
  onUserInputChange:PropTypes.func.isRequired
};

export default Sendform;
