## Incatch
Catching inconsistencies in low-code applications

---

### Project Overview

This project consists of three main modules: **Model Processor**, **Interpreter**, and **Analyzer**. These modules are located in the directory `Incatch/Incatch/src/Geodes/Loco/`.

#### Module Descriptions

##### Model Processor
The Model Processor is responsible for creating a trace model that conforms to the metamodel specified in `Incatch/Incatch/eli5metamodel/TraceMetamodelEli5.ecore`. 

##### Interpreter
Once the trace model is created, it is passed to the Interpreter module for evaluations. These interpreters act as external rule evaluators and save the evaluation results back into the trace model.

##### Analyzer
The Analyzer module generates Alloy code using the EGL file located at `Incatch/eli5transformation/eli5translate.egl`. It then executes this code to create a consistency report based on the evaluation results and the state of the system.

#### Rule Packs

The rule packs for evaluation can be found in `Incatch/Incatch/rulesPackForEval`. You have two options for using these files:

1. Pass the rule packs to the simple runner in `Incatch/Incatch/src/TraceMetamodelEli5/` to generate Alloy files.
2. Reconfigure the Ant builder in `Incatch/Incatch/build.xml` to start from creating trace models, redo the interpretations (external rule evaluators), and proceed to the analysis.

Ensure you have the necessary dependency installed. [alloytools](https://github.com/AlloyTools/org.alloytools.alloy/releases/tag/v5.1.0)

#### Output

The evaluation output is located in `Incatch/Incatch/src/OutputV7.xlsx`.
