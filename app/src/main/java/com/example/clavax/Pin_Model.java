package com.example.clavax;

public class Pin_Model {


    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String zipcode =""        ;
        public String Id          ="";








        public Pin_Model(String zipcode, String Id)
        {

            this.zipcode=zipcode;
            this.Id=Id;




        }



}
