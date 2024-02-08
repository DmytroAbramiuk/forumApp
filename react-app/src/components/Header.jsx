export default function Header() {
  return (
    <header>
      <h3>Forum App</h3>
      <nav className="navbar">
        <ul>
          <li>Home</li>
          <li>About</li>
          <li>Contacts</li>
          <li>
            <input type="text" id="search" placeholder="Search" />
          </li>
        </ul>
      </nav>
    </header>
  );
}
