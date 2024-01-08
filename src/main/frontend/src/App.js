import React, {useEffect, useState} from 'react';
import axios from 'axios';
import Hello from './Hello';

function App() {
  const [hello, setHello] = useState('')

  useEffect(() => {
    console.log('App 컴포넌트가 화면에 나타남');
    axios.get('/api/hello')
        .then(response => setHello(response.data))
        .catch(error => console.log(error));

    return () => {
      console.log('App 컴포넌트가 화면에서 사라짐');
    };         
  }, []);



  const name = 'react';
  const style = {
    backgroundColor: 'black',
    color: 'aqua',
    fontSize: 24, // 기본 단위 px
    padding: '1rem' // 다른 단위 사용 시 문자열로 설정
  }

  return (
      <div>
        <span>[REACT] Spring Boot Backend에서 가져온 데이터입니다. : {hello}</span>
        <Hello />
        <Hello />
        <Hello />
        <Hello />
        <Hello />
        <Hello />
        <Hello />
        <div style={style}>{name}</div>
      </div>
  );
}

export default App;