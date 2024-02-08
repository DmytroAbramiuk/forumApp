import React, { useState } from "react";

// Компонент InputForm
function InputForm({ onSave }) {
  const [topic, setTopic] = useState("");
  const [problem, setProblem] = useState("");

  const handleSend = () => {
    onSave({ topic, problem });
  };

  return (
    <div id="topic">
      <p>Send topic of your problem</p>
      <input
        type="text"
        id="topicname"
        value={topic}
        onChange={(e) => setTopic(e.target.value)}
      />
      <div id="problem">
        <p>Send your problem</p>
        <textarea
          id="problemtext"
          rows="4"
          cols="50"
          value={problem}
          onChange={(e) => setProblem(e.target.value)}
        ></textarea>
      </div>
      <button id="send" onClick={handleSend}>
        Send
      </button>
    </div>
  );
}

// Компонент Infobar, що включає InputForm
export default function Infobar() {
  const handleSave = (data) => {
    console.log("Data to save:", data);
    // Тут ви можете використовувати або зберегти дані, що передаються з InputForm
  };

  return (
    <div id="infobar">
      <div id="userinf">
        <img
          id="avatar"
          src="https://ctrana.news/img/article/2693/48_main.jpeg"
          alt="AVA"
        />
        <p id="username">Adolf Hitler </p>
        <p id="date">01.09.1939</p>
      </div>
      {/* Виклик компонента InputForm і передача onSave */}
      <InputForm onSave={handleSave} />
    </div>
  );
}
