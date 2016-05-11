package org.bookstore

import grails.rest.*

@Resource(uri='/authors', formats=['json', 'xml'])
class Author {

    String name

    static hasMany = [books: Book]

    static constraints = {
        name blank:false
    }
}
