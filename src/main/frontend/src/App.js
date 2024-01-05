import React, {useEffect, useState} from 'react';
import axios from 'axios';

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

  return (
      <div>
        백엔드에서 가져온 데이터입니다. : {hello}
      </div>
  );
}

export default App;