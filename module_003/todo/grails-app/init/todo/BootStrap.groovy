package todo

class BootStrap {

    def init = { servletContext ->
    	5.times { new Todo(description: "Todo ${it+1}").save() }

    	Role admin = new Role("ROLE_ADMIN").save()
		User user = new User("user", "pass").save()
		UserRole.create(user, admin, true)
    }
    
    def destroy = {
    }
}
