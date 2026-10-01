import { useState, useEffect } from 'react'

function App() {

  const [data,setData] = useState(null);
  useEffect(() => {
    fetch('http://localhost:7777/student')
      .then(response => response.json())
      .then(data => setData(data))
      .catch(error => console.error('error ', error));
  }, []);

  return (
  <div>
    {data&&(
      <div>
        <p>Student No:{data.sno}</p>
        <p>Student Name:{data.sname}</p>
        </div>
    )}

  </div>
  )
}

export default App
