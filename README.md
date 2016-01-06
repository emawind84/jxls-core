# jxls-core

Extension of Java jxls-core http://jxls.sourceforge.net/

A new Interface ``TaskLink`` is available to use to cancel excel transform operation asynchronously.

The ``TaskLink`` Interface has one method ``poll()`` that is invoked during the process.

``SimpleTaskLinkImpl`` is a simple implementation of this interface.
