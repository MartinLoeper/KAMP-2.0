# Karlsruhe Architectural Maintainability Prediction (KAMP) [![Build Status](https://travis-ci.org/MartinLoeper/KAMP-2.0.svg?branch=master)](https://travis-ci.org/MartinLoeper/KAMP-2.0) [![Issues](https://img.shields.io/github/issues/MartinLoeper/KAMP-2.0.svg)](https://github.com/MartinLoeper/KAMP-2.0/issues) [![License](https://img.shields.io/github/license/MartinLoeper/KAMP-2.0.svg)](https://raw.githubusercontent.com/MartinLoeper/KAMP-2.0/master/LICENSE) [![Deployment](https://img.shields.io/github/last-commit/MartinLoeper/KAMP-2.0/master.svg?label=last%20deployed%20nightly)](https://martinloeper.github.io/updatesite/nightly) [![Release](https://img.shields.io/github/release/MartinLoeper/KAMP-2.0.svg)](https://martinloeper.github.io/updatesite/release)

KAMP is an approach to analyze the change propagation in a software system from technical and organizational perspectives. It is based on the software architecture annotated with technical (e.g. deployment) and organizational artifacts (e.g. management).

## Update Site
In order to install KAMP, open an [Eclipse (Modelling Tools) Oxygen Installation](https://www.eclipse.org/downloads/packages/release/Oxygen/3.RC3), `Help -> Install New Software...` and insert the following into the 'work with' input field: https://martinloeper.github.io/updatesite/nightly.

More information at the [updatesite repository](https://github.com/MartinLoeper/updatesite).

## Related Projects
1) This project is a major restructuring of the [submodule-based KAMP repository](https://github.com/KAMP-Research/KAMP).
2) This project includes the [KAMP Rule Language](https://github.com/MartinLoeper/KAMP-DSL).

## Changelog
- This fork brings Continuous Integration to KAMP and enables our partners to install the framework more easily.
- KAMP Rule Language was added as a new feature

## Credits
This project was structured according to [Vitruv](https://github.com/vitruv-tools/Vitruv). A big shout-out to HeikoKlare, max-kramer and all other colleagues of the [kit-sdq](https://github.com/kit-sdq) team for setting up all this Maven Tycho stuff on Travis.

The following article by Lars Vogel and Simon Scholz was also very useful: http://www.vogella.com/tutorials/EclipseTycho/article.html
