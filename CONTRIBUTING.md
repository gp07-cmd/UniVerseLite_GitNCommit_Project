# ***UniVerse Lite*** **— Contributing to the University Management System**

## GitNCommit 🌱 — A 21-Day Open Source Campaign

**GitNCommit** is a 21-day open source event where CS (or Tech) students contribute real fixes, features, and improvements to a **Java-based** University Management System — built by students, improved by students. No internship required. No experience required. Just curiosity and a willingness to learn. 🙂  
*P.S. Non-Tech students are also encouraged to explore\!* 

---

## **What is this project?**

This is a Java OOP project — a University Management System with a Swing GUI — developed as part of a second-semester CS course at COMSATS University Islamabad. It manages students, courses, departments, library, cafeteria, hostels, transport, and more.

The codebase is intentionally imperfect. It has real bugs, real design gaps, and real room to grow. Your job as a contributor is to find them, fix them, and make this system better — while learning core OOP concepts in the process.

---

## **Who can contribute?**

Anyone. Seriously.

- First-semester student who just learned what a class is? Pick a `good-first-issue`.  
- Second-semester student comfortable with inheritance and GUIs? Tackle a `bug-major` or `enhancement`.  
- You do not need to know everything. You need to be willing to read, try, and ask.

---

## **Campaign Timeline — Commit Season**

| Day | Phase | What to do |
| :---- | :---- | :---- |
| Day 1–2 | **Read & Explore** | Fork the repo, clone it, run the project. Read the code. Read open Issues. |
| Day 3–5 | **Pick your Issue** | Comment on an Issue: *"I'd like to work on this."* Wait for it to be assigned to you. |
| Day 6–15 | **Build & Fix** | Work on your fix or feature on your own branch. Ask questions in the Issue thread. |
| Day 16–18 | **Polish** | Test your changes. Make sure nothing else breaks. Update comments if needed. |
| Day 19–20 | **Submit PR** | Open a Pull Request. Fill in the PR template. |
| Day 21 | **Review & Merge** | Maintainer reviews and merges accepted PRs. |

---

## **How to contribute — step by step**

### Step 1: Fork the repository

Click the **Fork** button at the top right of this page. This creates your own copy of the repo under your GitHub account.

### Step 2: Clone your fork

git clone https://github.com/YOUR-USERNAME/university-management-system.git

cd university-management-system

### Step 3: Create a branch for your work

Always work on a new branch — never directly on `main`.

git checkout \-b fix/null-check-setters

Name your branch descriptively:

- `fix/null-check-in-setters`  
- `feature/logo-svg`  
- `enhancement/override-equals-student`  
- `gui/improve-student-panel-layout`

### Step 4: Make your changes

Open the project in your IDE (IntelliJ IDEA or Eclipse recommended). Make your fix or add your feature. Keep your changes focused — one issue per branch.

### Step 5: Test your changes

Run the project. Make sure:

- The feature you added or bug you fixed works correctly  
- Nothing that was working before is now broken  
- The app compiles without errors or warnings

### Step 6: Commit your changes

git add .

git commit \-m "fix: add null guard before isBlank() in CampusEntity setters"

Write clear commit messages. Use these prefixes:

- `fix:` for bug fixes  
- `feat:` for new features  
- `gui:` for frontend/UI changes  
- `docs:` for documentation changes  
- `refactor:` for code improvements that don't change behavior

### Step 7: Push and open a Pull Request

git push origin fix/null-check-setters

Then go to your fork on GitHub and click **"Compare & pull request"**. Fill in the PR description template (see below).

---

## **Types of contributions we welcome**

### Bug fixes

Check the Issues tab for bugs labeled `bug-critical`, `bug-major`, or `bug-minor`. Each issue describes the class affected, what goes wrong, and a hint toward the fix. The thinking and implementation are up to you.

### GUI improvements (highly encouraged\!)

The Swing interface is functional but basic. You are welcome to improve the look and feel — but please follow the design rules below so the UI stays consistent.

### Logo / branding

Adding an SVG logo to the project is an **excellent first contribution** — especially if you enjoy design. See the logo guidelines below.

### Documentation

Improving comments in code, adding Javadoc to classes, or improving the README are all valid contributions.

### New features (advanced)

If you want to add something not listed in the Issues — a Teacher panel, a search feature, a print report button — open an Issue first and describe your idea. Wait for approval before building, so effort is not wasted.

---

## **GUI Design Rules**

If you are working on any visual/UI improvement, follow these rules so the interface stays consistent across contributions.

### Color Theme

The project uses a clean, minimal academic palette:

| Role | Color | Hex |
| :---- | :---- | :---- |
| Primary accent | Navy | `#0423676` |
| Secondary accent | Dream Sky | `#5B90C3` |
| Highlight | Bloom Pink | `#C57CA1` |
| Soft Highlight | Mauve Milk | `#DCA8C2` |
| Tertiary Accent | Lavender | `#C2BDDD` |
| Page Background | Soft BG | `#F4F2F8` |
| Surface/Cards | White | `#FFFFFF` |
| Primary text | Text Dark | `#1A1A2E` |
| Secondary text | Text Mid | `#5A5872` |

Apply these using constants — do not hardcode hex values inline in component code. A class like `AppTheme.java` (already in the project) is the right place.

### Typography

- **Font family**: use `new Font("SansSerif", ...)` for cross-platform compatibility. Do not hardcode system fonts like Segoe UI or San Francisco.  
- **Heading / panel titles**: `Font("SansSerif", Font.BOLD, 15)`  
- **Body / labels**: `Font("SansSerif", Font.PLAIN, 13)`  
- **Table content**: `Font("SansSerif", Font.PLAIN, 12)`  
- **Monospaced data** (IDs, registration numbers): `Font("Monospaced", Font.PLAIN, 12)`  
- Do not use font sizes below 11 or above 18 in standard UI components.

### Layout rules

- Use `BorderLayout` for main panels, `FlowLayout` or `GridLayout` for form rows.  
- Add consistent padding: at minimum `panel.setBorder(BorderFactory.createEmptyBorder(10, 14, 10, 14))` on all major panels.  
- Buttons should be consistently sized — avoid letting buttons stretch to fill full width unless intentional.  
- All Swing components must be `JLabel`, `JButton`, `JTextField`, etc. Do not mix AWT (`Label`, `Button`) with Swing.  
- Table rows should have a row height of at least 24: `table.setRowHeight(24)`.

### What not to do

- No gradient backgrounds  
- No neon or bright accent colors  
- No font sizes that vary wildly between components  
- No frames without titles  
- Do not change existing functionality while working on a GUI issue

---

## Logo Guidelines

Adding a project logo SVG is a great contribution. Here is what we are looking for:

**Concept**: something that represents a university system — a building, books, a graduation cap, a network of nodes, or a combination. It should feel academic and clean, not corporate.

**Format**: SVG only. Should work at both small (32x32 favicon) and large (200x200 README header) sizes.

**Color**: use the project's primary navy (`#0423676`), dream sky (`#5B90C3`) and bloom pink (`#C57CA1`) as the main colors. A third neutral like off-white or light gray is fine.

**Style**: flat, minimal, line-based or filled simple shapes. No gradients, no drop shadows, no 3D effects.

**Deliverable**: place the file at `assets/logo.svg`. Also provide `assets/logo-dark.svg` (inverted for dark backgrounds) if you wish.

**Size**: design on a 100x100 or 200x200 viewBox. Keep the SVG file under 10KB.

---

## **Pull Request template**

When you open a PR, please fill in this information:

\#\# What does this PR do?

(One sentence summary)

\#\# Which Issue does it fix?

Closes \#\[issue number\]

\#\# What did you change?

(List the files and what you changed in each)

\#\# How did you test it?

(Describe what you ran and what you checked)

\#\# OOP concept this relates to

(e.g. encapsulation, inheritance, polymorphism, abstraction)

\#\# Anything the reviewer should know?

---

## **Code style rules**

- Follow the existing indentation style (4-space indent, used throughout the project)  
- Every class must have a brief comment at the top describing its purpose  
- All setters must validate input before assigning (null check \+ blank check for Strings, range check for numbers)  
- No `System.out.println` inside GUI event listeners — use `JOptionPane` dialogs or a dedicated output area instead  
- Backend classes (`Backend/` package) must not contain `Scanner` or any GUI import — keep backend and frontend fully separate  
- Method names use `camelCase`, class names use `PascalCase`, constants use `UPPER_SNAKE_CASE`

---

## **Asking for help**

If you are stuck:

1. Re-read the Issue description and its comments  
2. Check if someone already asked the same question in the Issue thread  
3. If still stuck, comment on the Issue — describe what you tried and where you got stuck  
4. Be patient — this is a volunteer-run student project

Being stuck is normal. Asking for help clearly is a skill. Practice both.

---

## **What you get out of this**

- Real git/GitHub workflow experience (fork \-\> branch \-\> PR \-\> review \-\> merge)  
- A merged contribution you can show in your CV and GitHub profile  
- Deeper understanding of Java OOP concepts by fixing real bugs in a real codebase  
- Feedback on your code from a peer who has seen the whole system  
- Your name in the Contributors section of this README

---

## **Contributors**

A huge thank you to everyone who contributes — whether it is a one-line fix or a full feature. Every commit counts. 🌱

---

*GitNCommit is a student-led open source initiative. It is not affiliated with any company, internship program, or bootcamp. It is just students helping students write better code.*  
