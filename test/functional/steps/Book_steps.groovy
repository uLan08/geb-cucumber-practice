import static cucumber.api.groovy.EN.*
//import pages.ListPage


Given (~'^I open the book tracker$') { ->
//    def listpage = new ListPage()
//    to listpage
//    at listpage

    go "http://localhost:8090/cucumberprac/book/index"

//    to ListPage
//    at ListPage
}

When (~'^I add "([^"]*)"$') { String bookTitle ->
    assert false
}

Then (~'^I see "([^"]*)"s details$') { String bookTitle ->
    assert false
}