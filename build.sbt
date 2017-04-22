commands += Command.args("scalafmt") {
  case (state, args) =>
    val Right(scalafmt) org.scalafmt.bootstrap.ScalafmtBootstrap.fromVersion("0.6.8")
    scalafmt.main("--non-interactive" +: args.toArray)
    state
}
