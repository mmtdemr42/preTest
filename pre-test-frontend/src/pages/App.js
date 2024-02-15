import "../styles/App.css";
import { Route, Routes } from "react-router-dom";
import CreatePage from "./create";
import HomePage from "./home";
import ListPage from "./list";

function App() {
  return (
    <>
      <div className="App">
        <Routes>
          <Route path="/" element={<HomePage />} />
          <Route path="/create" element={<CreatePage />} />
          <Route path="/create/:id" element={<CreatePage />} />
          <Route path="/list" element={<ListPage />} />
        </Routes>
      </div>
    </>
  );
}

export default App;
