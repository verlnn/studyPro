import './App.css';
import React, {useEffect, useState} from 'react';
import axios from 'axios';

function App() {
    return (
        <button onClick={ () => testClick('JJ', '1234') }>click</button>
    )
}

const testClick = (id, pw) => {
    axios
        .post("http://172.30.1.92:8080/api/login", {
            userId: id,
            userPassword: pw,
        })
}
/*
axios
    .post("http://localhost:8080/api/login", {
        email: inputId,
        passwd: inputPw,
    })
*/
export default App;
