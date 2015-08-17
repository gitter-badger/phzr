# phzr

A ClojureScript wrapper for the Phaser HTML5 game framework.

![](https://clojars.org/phzr/latest-version.svg)


## What is Phaser?

[Phaser](http://phaser.io) is a fast, free and fun open source framework
for Canvas and WebGL powered browser games. It supports several physics
libraries, tilemaps, sprite and vector animations, and audio/video rendering,
as well as many other features.


## Okay, so what is phzr?

The phzr wrapper aims to provide a complete facade over the Phaser library.
Namespaces in phzr should line up with the corresponding Phaser
Javascript class hierarcy, i.e. `Phaser.AnimationManager` can be referenced
at `phzr.animation-manager`. Instance methods for a class namespace always
take an instance of that class as the first argument. Static methods do not,
and are denoted by a trailing hyphen. If the corresponding Phaser class can be
instantiated, the phzr namespace will also include a constructor function which
follows the Clojure record constructor arrow naming scheme.

Along with the namespace wrappers, phzr also
[extends](src/phzr/impl/extend/core.cljs#L33) each Phaser class to implement a
number of useful Clojure protocols. Currently, this allows functions like `get`,
`get-in`, and `seq` to work on Phaser objects. As phzr develops, it may extend
Phaser classes to more core protocols. When working with Phaser objects in phzr,
only public properties are exposed through the protocol implementations.
If a Phaser class has constants, the corresponding phzr namespace will have a
`const` function which takes a keyword as an argument. All property and constant
names have been converted to Clojure-style kebab-case keywords.

Additionally, Phaser classes implement the IPhaserObj protocol defined in the
phzr.core namespace. Currently, this protocol specifies a function `pset!`,
which allows phaser object properties to be mutated directly. The `pset!`
function works similarly to `aset`, differing in that it accepts only the
keyword-ized versions of the object property names, and will not allow mutations
on properties marked as read-only or internal.


## How do I get started?

Just include the phzr library in your ClojureScript project's build
dependencies. The phzr library makes use of the awesome cljsjs package
system to pull in the correct Phaser javascript source automatically.

Once you've got phzr installed in your project, check out the Phaser
[documentation](http://phaser.io/docs) and
[learning resources](http://phaser.io/learn) to get started using Phaser.

Check out the [phzr-demo](https://github.com/dparis/phzr-demo) app for some
examples!


## How can I contribute?

Check the phzr github project for open issues and feel free to submit a PR.

In the immediate future, the phzr source needs to be reviewed for accuracy.
Most of the source was auto-generated by parsing a JSON representation of the
source which was itself generated from the jsdoc comments in the Phaser
javascript code. Check out the [gen-phzr](https://github.com/dparis/gen-phzr)
app for more details.

Several of the Phaser demo projects have been implemented successfully
using phzr as an initial sanity test, but there are almost certainly dark
corners and special cases which will need to be hand-tweaked.


## License

Copyright © 2015 Dylan Paris

Distributed under the MIT License.
