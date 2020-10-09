import React from "react"
import { Route, BrowserRouter, Redirect } from "react-router-dom"
import NavBar from "./NavBar"

const App = props => {
  return (
  	<BrowserRouter>
      <Route path="/pets" component={NavBar} />
      <Redirect exact from="/" to="/pets" />
    </BrowserRouter>
  )
}

export default App
