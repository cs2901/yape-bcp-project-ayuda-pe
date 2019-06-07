import React from 'react'
import MessageList from './components/MessageList'
import Header from './components/Header'
import Sendform from './components/Sendform'


class App extends React.Component {
    render() {
        return (
            <div className="app">
                <Header />
                <MessageList />
                <Sendform />
            </div>
        );
    }
}

export default App
