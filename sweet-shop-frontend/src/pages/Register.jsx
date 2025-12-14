import { useState } from "react";
import { registerApi } from "../api/auth";
import { useNavigate, Link } from "react-router-dom";

export default function Register() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const navigate = useNavigate();

  const submit = async () => {
    await registerApi({ username, password });
    alert("Registered successfully");
    navigate("/login");
  };

  return (
    <div className="container">
      <h2>Register</h2>
      <input placeholder="Username" onChange={e => setUsername(e.target.value)} />
      <input type="password" placeholder="Password" onChange={e => setPassword(e.target.value)} />
      <button onClick={submit}>Register</button>
      <p>
        Already have an account? <Link to="/login">Login</Link>
      </p>
    </div>
  );
}
