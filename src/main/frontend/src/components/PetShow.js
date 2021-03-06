import React, { useState, useEffect } from 'react'
import PetAdoptionsForm from './PetAdoptionsForm'

const PetShow = (props) => {
  const [displayForm, setDisplayForm] = useState(false)
  const [pet, setPet] = useState({})
  const [applicationStatus, setApplicationStatus] = useState("")
  const [pageFound, setPageFound] = useState(true)
  // let vaccinated = pet.vaccination_status  === true? "Yes" : "No"


//  let vaccinated = "No";
//  if(pet.vaccination_status) { vaccinated = "Yes" }
  
  useEffect(() => {
   fetch(`/api/v1${props.location.pathname}`)
    .then(response => {
      if (response.ok) {
      return response
    } else {
      setPageFound(false)
    }
  })
    .then(result =>  result.json())
    .then(pet => {
      setPet(pet)
    })
  }, []);
  
  const handleAdoptClick = () => {
    let formState = displayForm === true ? false : true
    setDisplayForm(formState)
  }

  let adoptForm;
  if (applicationStatus === "pending") adoptForm = "Your request is in process"
  else {
    adoptForm = displayForm === true ? 
    <PetAdoptionsForm pet_id={pet.id} 
      setApplicationStatus={setApplicationStatus}
      setDisplayForm={setDisplayForm}
      /> : <button onClick={handleAdoptClick}>Adopt Me!</button>
  }

  let vaccinated;
  let petShowPage;
  if(pet && pet.name) {
     if(pet.vaccination_status===true) {
        vaccinated = "Yes"
      } else {
        vaccinated = "No"
      }
    petShowPage = (<div>
                    <h1>Adopt Me!!</h1>
                    <img src = {pet.img_url}></img>
                    <h3>Name: {pet.name}</h3>
                    <p>Age: {pet.age}</p>
                    <p>Vaccinated: {vaccinated}</p>
                    <p>{pet.adoption_story}</p>
                    {adoptForm}
                  </div>)
  }



  
  let bad;
  if(!pageFound) {
    bad = <p>Page not found</p>
  }
  
  return (
    <div>
    {bad}
    {petShowPage}
    </div>
  );
  }


export default PetShow
