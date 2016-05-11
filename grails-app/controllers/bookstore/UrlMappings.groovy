package bookstore

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: 'application', action:'index')

        "/books"(resources:"book")
        "/authors"(resources:"author")

        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
