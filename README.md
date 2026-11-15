# BlissOS 16 Go Custom Lab
Atelier automatisé sur GitHub Actions pour :
1. Télécharger et déverrouiller à froid **Bliss OS 16.9.7 Go (GApps)** pour partition `ext4` (Zorin OS).
2. Activer l'overlay système (`ro.config.low_ram=false`) pour le keymapper (XtMapper) et les réseaux sociaux.
3. Analyser les logs système (`logcat` / `dmesg`) via IA locale (Qwen2.5-Coder) pour éliminer les ANR.
