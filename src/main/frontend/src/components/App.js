import React from "react"
import { Route, BrowserRouter, Redirect } from "react-router-dom"
import NavBar from "./NavBar"

const App = props => {
  return (
    <BrowserRouter>
      <Route path="/pets" component={NavBar} />
      <Route path="/adoptions" component={NavBar} />
      <Route path="/admin/review" component={NavBar} />
      <Route exact path="/" component={NavBar}>
        <Redirect to="/pets" />
      </Route>
    </BrowserRouter>
  )
}


export default App