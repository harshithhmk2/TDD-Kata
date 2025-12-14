import { useEffect, useState, useContext } from "react";
import api from "../api/axios";
import { AuthContext } from "../context/AuthContext";
import { useNavigate } from "react-router-dom";

export default function Sweets() {
  const [sweets, setSweets] = useState([]);
  const { user, logout } = useContext(AuthContext);
  const navigate = useNavigate();

  const load = async () => {
    const res = await api.get("/sweets");
    setSweets(res.data);
  };

  useEffect(() => {
    load();
  }, []);

  const purchase = async (id) => {
    await api.post(`/sweets/${id}/purchase?qty=1`);
    load();
  };

  return (
    <div className="container">
      <h2>🍬 Sweet Shop</h2>

      <button onClick={logout}>Logout</button>

      {user?.role === "ADMIN" && (
        <button onClick={() => navigate("/admin")}>Admin Panel</button>
      )}

      {sweets.map(s => (
        <div key={s.id} className="card">
          <h3>{s.name}</h3>
          <p>{s.category}</p>
          <p>₹{s.price}</p>
          <p>Stock: {s.quantity}</p>

          <button
            disabled={s.quantity === 0}
            onClick={() => purchase(s.id)}
          >
            {s.quantity === 0 ? "Out of Stock" : "Purchase"}
          </button>
        </div>
      ))}
    </div>
  );
}
