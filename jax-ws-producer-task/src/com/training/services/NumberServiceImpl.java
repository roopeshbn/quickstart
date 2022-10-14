package com.training.services;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.training.ifaces.NumberToTextService;

@WebService(endpointInterface ="com.training.ifaces.NumberToTextService")
public class NumberServiceImpl implements NumberToTextService{
	
	  @Override
	    @WebResult(name="Number To Text")
	    public String numberToText(@WebParam(name="number")int number) {
	        String res=null;
	        //int choice=4;
	        switch(number) {
	        case 1: res="one";
	                break;
	        case 2: res="Two";
	        break;
	        case 3: res="Three";
	        break;
	        case 4: res="Four";
	        break;
	        case 5: res="Five";
	        break;
	        case 6: res="Six";
	        break;
	        case 7: res="Seven";
	        break;
	        case 8: res="Eight";
	        break;
	        case 9: res="Nine";
	        break;
	        case 10: res="Ten";
	        break;
	        }
	        
	        return res;
	    }



	}
	
	

