import './App.css';
import axios from 'axios';
import Swal from 'sweetalert2';

function App() {
    return (
        // <button onClick={ () => testClick('JJ', '1234') }>click</button>
        <div>
            <button onClick={() => testAlert(true, true)}>로그인</button>
            <button onClick={() => testAlert(false, true)}>아이디 없음</button>
            <button onClick={() => testAlert(true, false)}>비밀번호 없음</button>
        </div>
    )
}

const testAlert = (checkId, matchInfo) => {
    axios
        .post("http://localhost:8080/api/login", {
            checkId: checkId,
            matchInfo: matchInfo,
        }).then(res => {
        successAlert();
    }).catch(error => {
        errorAlert(error.response.data.message);
    })
}

const testClick = (id, pw) => {
    axios
        .post("http://localhost:8080/api/login", {
            userId: id,
            userPassword: pw,
        }).then(res => {
        console.log("res : ", res);
    }).catch(error => {
        errorAlert(error.response.data.message);
    })
}

const successAlert = () => {
    const Toast = Swal.mixin({
        toast: true,
        position: 'top-end',
        showConfirmButton: false,
        timer: 2000,
        timerProgressBar: true,
        didOpen: (toast) => {
            toast.addEventListener('mouseenter', Swal.stopTimer)
            toast.addEventListener('mouseleave', Swal.resumeTimer)
        }
    })

    Toast.fire({
        icon: 'success',
        title: '로그인 되었습니다.'
    })
}

const errorAlert = (message) => {
    const Toast = Swal.mixin({
        toast: true,
        position: 'top-end',
        showConfirmButton: false,
        timer: 3000,
        timerProgressBar: true,
        didOpen: (toast) => {
            toast.addEventListener('mouseenter', Swal.stopTimer)
            toast.addEventListener('mouseleave', Swal.resumeTimer)
        }
    })

    Toast.fire({
        icon: 'error',
        title: message
    })
}

export default App;
