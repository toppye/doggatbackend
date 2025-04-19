package com.muiz.doggat;

import com.fasterxml.jackson.annotation.JsonProperty;

public record Order_record(

        @JsonProperty("Cname")
        String CustomerName,

        @JsonProperty("Pname")
        String ProductName,

        @JsonProperty("qname")
        int Quantity

){

}
