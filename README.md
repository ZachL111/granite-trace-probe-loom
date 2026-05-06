# granite-trace-probe-loom

`granite-trace-probe-loom` explores observability with a small Scala codebase and local fixtures. The technical goal is to package a Scala local lab for probe analysis with capacity fixtures, allocation and spill reports, and documented operating limits.

## Why It Exists

This is intentionally local and self-contained so it can be inspected without credentials, services, or seeded history.

## Granite Trace Probe Loom Review Notes

The first comparison I would make is `signal loss` against `span volume` because it shows where the rule is most opinionated.

## Features

- `fixtures/domain_review.csv` adds cases for span volume and latency skew.
- `metadata/domain-review.json` records the same cases in structured form.
- `config/review-profile.json` captures the read order and the two review questions.
- `examples/granite-trace-probe-walkthrough.md` walks through the case spread.
- The Scala code includes a review path for `signal loss` and `span volume`.
- `docs/field-notes.md` explains the strongest and weakest cases.

## Architecture Notes

The repository has two validation layers: the original compact policy fixture and the domain review fixture. They are separate so one can change without hiding failures in the other.

The added Scala path is deliberately direct, with fixtures doing most of the explaining.

## Usage

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File scripts/verify.ps1
```

## Tests

The check exercises the source code and the review fixture. `edge` is the high score at 197; `stale` is the low score at 120.

## Limitations And Roadmap

No external service is required. A deeper version would add more negative cases and a clearer boundary around invalid input.
