# RÈGLES DE TRAVAIL STRICTES POUR L'AGENT IA (AIDER / QWEN 2.5 CODER)

## Contexte du projet
- **Système cible :** Bliss OS 15 (Android 12) rooté avec KernelSU (Termux + wrapper `su`).
- **Matériel :** Lenovo IdeaPad 330-15IGM (Intel Celeron 1.1 GHz, 4 Go RAM, GPU Intel UHD 600).
- **Profil du pilote :** L'utilisateur n'est pas développeur. Il dirige le projet, décrit les bugs et teste sur la machine.

## Règles de rigueur obligatoires
1. **Langue et clarté :** Toujours répondre en français clair et simple. Expliquer le "pourquoi" avant de modifier un fichier.
2. **Une étape à la fois :** Ne jamais modifier plusieurs composants en même temps. Corriger un bug, valider le résultat, puis passer au suivant.
3. **Approche non destructive (KernelSU Overlay) :** Ne jamais modifier la partition système brute en lecture seule. Toujours générer des fichiers propres dans le dossier `overlay/system/` destinés à être montés à chaud via un module KernelSU.
4. **Analyse avant action :** Avant de proposer un correctif, toujours vérifier les journaux dans `diagnostic-logs/` (`logcat`, `dmesg`).
5. **Mémoire permanente (`JOURNAL.md`) :** À la fin de chaque modification réussie ou tentative, mettre à jour le fichier `JOURNAL.md` avec : la date, le problème traité, la modification appliquée et l'étape suivante.
