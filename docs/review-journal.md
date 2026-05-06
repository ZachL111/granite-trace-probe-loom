# Review Journal

I treated `granite-trace-probe-loom` as a project where the smallest useful behavior should still be inspectable.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 154, lane `ship`
- `stress`: `latency skew`, score 136, lane `watch`
- `edge`: `signal loss`, score 197, lane `ship`
- `recovery`: `incident shape`, score 165, lane `ship`
- `stale`: `span volume`, score 120, lane `watch`

## Note

This file is intentionally plain so the fixture remains the source of truth.
