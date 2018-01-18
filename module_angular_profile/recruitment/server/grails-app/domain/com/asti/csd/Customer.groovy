package com.asti.csd
import grails.rest.*


@Resource(uri = '/customer', readOnly = false, formats = ['json', 'xml'])
class Customer {

  String name
  String address
  String city
  String postalCode
  String phone

  static constraints = {
      name blank:false
      address blank:false
      city blank:false
      postalCode blank:false
      phone blank:false
  }

  String toString() {
    name
  }
}
