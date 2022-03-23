# Annot8 API

This is the Annot8 API repository.

For an implementation of the Annot8 API, see the projects in the [Annot8](https://github.com/annot8/annot8) repository.
For components that can be used within the Annot8 framework, see the [Annot8 Components](https://github.com/annot8/annot8-components) repository.

## Annot8

Annot8 is a framework for extracting structured information from unstructured data.
As a simple example, this could be extracting e-mail addresses from a collection of text documents, or faces from a collection of images.

## Terminology

* Annotation - Some information highlighted in Content, for example a span of text
* Content - A “view” on an Item, for example the text extracted from a Word document
* Item - A data object for processing, for example a Word document
* Processor - A processor is an Annot8 component that processes Content in some way, for example annotating e-mail addresses
* Property - A property is a key-value pair on an Annot8 object (such as an Annotation, an Item or Content) which provides additional meta-data, for example the author of a document
* Source - An Annot8 component which creates new Item objects, for example by finding files in a folder on your hard drive

Processor and Source are known as components, and components are generally formed of three separate classes:

* Processor or Source - the code that actually does the work
* Descriptor - code to describe and create new components
* Settings (optional) - configuration information for the component (generally used by the descriptor when creating new instances)


## Versioning

The following approach is used to versioning within the Annot8 projects:

* The core Annot8 API is versioned as `major.minor` (e.g. `1.2`). 
  Any minor versions will be fully backwards compatible, but major versions may not be.
* Annot8 projects are versioned as `major.minor.project-version` (e.g. `1.2.1`) where the `major.minor` version will match the API version used by the project, and will have their own project version.
  These projects may be developed and released at different rates, and therefore may have different project versions. An optional patch version may be added.
## Development

All development changes should make pull requests to the `develop` branch. 
This should be under a `-SNAPSHOT` version. 
For development convenience this is set to be the default branch.

Releases will be made from `main` and each PR to `main` should change the version number.
 
## Licence

Code in this repository is licenced under the [Apache Software Licence 2](https://www.apache.org/licenses/LICENSE-2.0).
See the NOTICE file for any additional restrictions.