# phzr

A ClojureScript wrapper for the Phaser HTML5 game framework.


## What is Phaser?

[Phaser](http://phaser.io) is a fast, free and fun open source framework
for Canves and WebGL powered browser games. It supports several physics
libraries, tilemaps, sprite and vector animations, and audio/video rendering,
as well as many other feature.


## How do I get started?

Once phzr has been deployed to clojars (coming soon!), just include the phzr
library in your ClojureScript project's build dependencies. The phzr library
makes use of the awesome cljsjs package system to pull in the correct Phaser
javascript source automatically.

Once you've got phzr installed in your project, check out the Phaser
[documentation](http://phaser.io/docs) and
[learning resources](http://phaser.io/learn) to get started using Phaser.

The phzr wrapper aims to provide a complete facade over the Phaser class
namespaces. Namespaces in phzr should line up with the corresponding Phaser
javascript class hierarcy, i.e. `Phaser.AnimationManager` can be referenced
at `phzr.animation-manager`. Instance methods for a class namespace always
take an instance of that class as the first argument. Static methods do not,
and are denoted by a trailing hyphen. If the corresponding Phaser class can be
instantiated, the phzr namespace will also include a constructor function which
follows the Clojure record constructor arrow naming scheme.

Along with the namespace wrappers, phzr also
[extends](src/phzr/impl/extend/core.cljs#L33) each Phaser class to implement a
number of useful Clojure protocols. Currently, this allows functions like `get`,
`get-in`, and `seq` to work on Phaser objects. As phzr develops, it may extend
Phaser classes to more types.


## How can I contribute?

Check the phzr github project for open issues and feel free to submit a PR. In
the immediate future, the phzr source needs to be reviewed for accuracy. Most of
the source was auto-generated by parsing a JSON representation of the source
which was itself generated from the jsdoc comments in the Phaser javascript
code. Several of the Phaser demo projects have been implemented successfully
using phzr as an initial sanity test, but there are almost certainly dark
corners and special cases which will need to be hand-tweaked.


## License

Copyright © 2015 Dylan Paris

Distributed under the MIT License.