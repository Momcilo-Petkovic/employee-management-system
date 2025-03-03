import React from 'react'
import {NavLink} from 'react-router-dom'

const HeaderComponent = () => {
  return (
    <div>
        <header>
            <nav className='navbar navbr-dark bg-dark navbar-expand-lg'>
                <a className="navbar-brand text-light mx-2" href="http://localhost:3000/">Employee Management System</a>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul className="navbar-nav me-auto mb-2 mb-lg-0">
        <li className="nav-item">
          <NavLink className='nav-link text-white-50' to='/employees'>Employees</NavLink>
        </li>

        <li className="nav-item">
          <NavLink className='nav-link text-white-50' to='/departments'>Departments</NavLink>
        </li>
      </ul>
    </div>
            </nav>
        </header> 
    </div>
  )
}

export default HeaderComponent