# Granite Trace Probe Loom Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 154 | ship |
| stress | latency skew | 136 | watch |
| edge | signal loss | 197 | ship |
| recovery | incident shape | 165 | ship |
| stale | span volume | 120 | watch |

Start with `edge` and `stale`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

`edge` is the optimistic case; use it to make sure the scoring path still rewards strong signal.
