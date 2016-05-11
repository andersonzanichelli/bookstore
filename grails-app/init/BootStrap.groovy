import org.bookstore.*

class BootStrap {

    def init = { servletContext ->

    	Book neuromancer = new Book(title:"Neuromancer").save()
    	new Author(name:"Willian Gibson", books:[neuromancer]).save()

    	Book bearAndDragon = new Book(title:"The Bear and the Dragon").save()
        new Author(name:"Tom Clancy", books:[bearAndDragon]).save()
    }

    def destroy = {
    }
}
