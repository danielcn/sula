import scala.io.Source.fromURL

object Data{    
  def get_data(){
    val url = "https://jsonplaceholder.typicode.com/todos"
    val json = fromURL(url).mkString
    return json
  }  
}