import React, { useState } from "react";
import "./App.css";

//we use the useState hook to manage two state variables: 
// todos (an array of todos) 
// inputValue (the current value of the input field).

function TodoList() {
  const [todos, setTodos] = useState([]); //State Variables
  const [inputValue, setInputValue] = useState(""); //State Variables

  // The addTodo function is triggered when the "Add Todo" button is clicked. It checks if the inputValue is not empty and adds it to the todos array, then clears the input field.
  const addTodo = () => {
    if (inputValue.trim() !== "") {
      setTodos([...todos, inputValue]);
      setInputValue("");
    }
  };

  // The deleteTodo function is called when the "Delete" button is clicked for a specific todo. It filters the todos array to exclude the todo at the given index, updating the state accordingly.
  const deleteTodo = (index) => {
    const updatedTodos = todos.filter((_, i) => i !== index);
    setTodos(updatedTodos);
  };

  // The todos are rendered as list items inside an unordered list (ul). Each item has a corresponding "Delete" button that calls the deleteTodo function for the corresponding index.
  return (
    <div className="todo-container">
      <input
        type="text"
        value={inputValue}
        onChange={(e) => setInputValue(e.target.value)}
      />
      <button onClick={addTodo}>Add Todo</button>
      <ul>
        {todos.map((todo, index) => (
          <li key={index}>
            {todo}
            <button onClick={() => deleteTodo(index)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TodoList;
// The user can add new todos, delete existing ones, and see the updated list in real-time. 
 







//=============================================================================================================================
// import React from "react";
// import "./App.css";

// // https://www.digitalocean.com/community/tutorials/how-to-build-a-react-to-do-app-with-react-hooks#step-2-styling-your-application

// function Todo({ todo }) {
//   return (
//     <div className="todo">
//       {todo.text}
//     </div>
//   );
// };

// function TodoForm({ addTodo }) {
//   const [value, setValue] = React.useState("");

//   const handleSubmit = e => {
//     e.preventDefault();
//     if (!value) return;
//     addTodo(value);
//     setValue("");
//   };

//   return (
//     <form onSubmit={handleSubmit}>
//       <input
//         type="text"
//         className="input"
//         value={value}
//         onChange={e => setValue(e.target.value)}
//       />
//     </form>
//   );
// }

// function App() {
//   const [todos, setTodos] = React.useState([
//     { text: "Learn about React" },
//     { text: "Meet friend for lunch" },

//   ]);
//   const addTodo = text => {
//     const newTodos = [...todos, { text }];
//     setTodos(newTodos);
//   };

//   return (
//     <div className="app">
//       <div className="todo-list">
//         {todos.map((todo, index) => (
//           <Todo
//             key={index}
//             index={index}
//             todo={todo}
//           />
//         ))}
//            <TodoForm addTodo={addTodo} />
//       </div>
//     </div>
//   );
// }

// export default App;
