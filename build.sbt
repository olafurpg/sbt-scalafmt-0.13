def latestScalafmt = "0.6.8"

commands += Command.args("scalafmt013", "Run scalafmt cli.") {
  case (state, args) =>
    val Right(scalafmt) =
      org.scalafmt.bootstrap.ScalafmtBootstrap.fromVersionUncached(latestScalafmt)
    scalafmt.main("--non-interactive" +: args.toArray)
    state
}
