import { useState, useContext } from "react";
import { loginApi } from "../api/auth";
import { AuthContext } from "../context/AuthContext";
import { useNavigate, Link } from "react-router-dom";

export default function Login() {
  const [username, setUsername] = useState("");
  const [password, setPassword] = useState("");
  const { login } = useContext(AuthContext);
  const navigate = useNavigate();

  const submit = async () => {
    const res = await loginApi({ username, password });
    login(res.data);
    navigate("/sweets");
  };

  return (
    <div className="container">
      <h2>Login</h2>
      <input placeholder="Username" onChange={e => setUsername(e.target.value)} />
      <input type="password" placeholder="Password" onChange={e => setPassword(e.target.value)} />
      <button onClick={submit}>Login</button>
      <p>
        New user? <Link to="/register">Register</Link>
      </p>
    </div>
  );
}
