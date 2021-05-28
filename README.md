# Annot8 API

This is the Annot8 API repository.

For an implementation of the Annot8 API, see the projects in the [Annot8](https://github.com/annot8/annot8) repository.
For components that can be used within the Annot8 framework, see the [Annot8 Components](https://github.com/annot8/annot8-components) repository.

## Annot8

Annot8 is a framework for extracting structured information from unstructured data.
As a simple example, this could be extracting e-mail addresses from a collection of text documents, or faces from a collection of images.

## Terminology

* Annotation - Some information highlighted in Content, for example a span of text or a segment of audio
* Content - A “view” on an Item, for example the text extracted from a Word document
* Item - A data object for processing, for example a Word document
* Processor - A processor is an Annot8 component that processes Content in some way, for example annotating e-mail addresses
* Property - A property is a key-value pair on an Annot8 object (such as an Annotation, an Item or Content) which provides additional meta-data, for example the author of a document
* Source - An Annot8 component which creates new Item objects, for example by finding files in a folder on your hard drive

Processor and Source are known as components, and components are generally formed of three separate classes:

* Processor or Source - the code that actually does the work
* Descriptor - code to describe and create new components
* Settings (optional) - configuration information for the component (generally used by the descriptor when creating new instances)

## Licence

Code in this repository is licenced under the [Apache Software Licence 2](https://www.apache.org/licenses/LICENSE-2.0).
See the NOTICE file for any additional restrictions.
