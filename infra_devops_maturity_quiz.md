Infra & DevOps Maturity Quiz

---

**1. Toolchain & Workflow Fragmentation**
How do your teams manage infra and deployment workflows today?

1. Each team uses their own tools and scripts
2. Everyone uses the same tools (like Terraform, ArgoCD), but builds their own logic
3. Some shared modules exist but are not enforced
4. We use a centralized platform to manage infra, CI/CD, and policies ✅ Correct Answer

*Explanation:* Option 4 represents full standardization, central governance, and consistency across teams, reducing tool fragmentation and improving efficiency.

---

**2. Infrastructure Standardization & Governance**
How uniform is your infra setup across projects and teams?

1. Teams define their infra manually and review by hand
2. Shared IaC modules exist but are often modified per project
3. Teams use approved modules with basic governance
4. All infra is created using shared infrastructure templates that have built-in standards and rules ✅ Correct Answer

*Explanation:* Option 4 ensures consistency, reduces configuration drift, and enforces standards across all projects.

---

**3. Change Management & Release Control**
How do you manage changes to infrastructure?

1. Changes are made directly and manually
2. We rely on Terraform plans or Git commits to track changes
3. Infra releases are versioned and go through a pipeline
4. All infra changes are tracked, reviewed, and rolled out via a platform ✅ Correct Answer

*Explanation:* Option 4 ensures full automation, review, and auditability, minimizing errors and enabling safe, scalable changes.

---

**4. Platform Thinking & Enablement**
Have you adopted a platform-led approach for infra and delivery?

1. No — every team owns their own stack
2. We have some wrappers around Terraform or internal scripts
3. Teams can use curated templates or apps
4. Developers and DevOps use a common platform with reusable components ✅ Correct Answer

*Explanation:* Option 4 promotes platform thinking, reusability, and developer self-service, increasing speed and reducing duplicated effort.

---

**5. Developer Self-Service Maturity**
Can developers set up environments or infra without help from DevOps?

1. No — developers raise tickets for every request
2. Developers can run Terraform or basic scripts
3. Some internal tooling helps, but coverage is limited
4. Developers use a portal or platform to provision governed infra themselves ✅ Correct Answer

*Explanation:* Option 4 maximizes developer autonomy while ensuring governance and security.

---

**6. Automation Ownership & Scaling**
As infra scales, how are you reducing DevOps effort per team?

1. We hire more DevOps engineers to keep up
2. Each team writes more automation scripts as needed
3. Platform team builds shared modules and runbooks
4. Platform abstracts infra delivery and enables teams to self-serve ✅ Correct Answer

*Explanation:* Option 4 abstracts complexity, reduces repeated work, and enables scaling without proportional increase in DevOps resources.

---

**7. Compliance & Security Automation**
How do you enforce security/compliance in infra delivery?

1. Checks happen only during manual audits
2. Some checks happen in CI/CD or via cloud policies
3. Policy engines like OPA are used but not across the board
4. Every change is validated by policies before infra is provisioned ✅ Correct Answer

*Explanation:* Option 4 ensures all changes comply with policy automatically, reducing risk and avoiding manual bottlenecks.

---

**8. Multi-Cloud & Environment Consistency**
How do you maintain consistency across dev/stage/prod or across clouds?

1. Each environment is configured separately
2. Some shared scripts exist but differences still creep in
3. Guardrails and reusable modules are used across environments
4. Environment creation is standardized and drift-free via a platform ✅ Correct Answer

*Explanation:* Option 4 ensures reproducibility and avoids configuration drift across multiple environments.

---

**9. DevOps & Developer Interaction**
What is your collaboration model between developers and DevOps?

1. Devs raise tickets and wait for Ops help
2. Some shared knowledge or Slack channels, but still a dependency
3. Reusable infra modules and CI templates are provided
4. Developers write specs; platform handles the infra provisioning ✅ Correct Answer

*Explanation:* Option 4 supports a high-trust, self-service model where developers focus on requirements while the platform manages delivery.

---

**10. AI & Intelligent Automation Adoption**
Are you using AI in any form to assist DevOps or platform tasks?

1. Not yet — no AI usage in infra or CI/CD
2. Using ChatGPT or similar tools to write IaC/scripts
3. Experimenting with AI to generate infra templates or validate configs
4. Using AI to recommend architectures, detect drifts, or automate pipelines ✅ Correct Answer

*Explanation:* Option 4 leverages AI to optimize infrastructure operations, detect issues proactively, and improve efficiency and decision-making.

