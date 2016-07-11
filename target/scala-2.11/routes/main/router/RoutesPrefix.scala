
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/masaki.kamachi/git/my-first-scala/conf/routes
// @DATE:Mon Jul 11 17:02:10 JST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
