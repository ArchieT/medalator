(ns medalator.parser.origstrs)

(def res
  {:ap #"^[\\_-]{0,4} ?([\d.,\s/o\\|liIqtTaeBgOSszZn]+)[ ]?A[Pp][ \|Il_]+.+A[Pp]$"
   :lvl #"^[,_]{0,4} ?[Ll][vVUur][Lli]([\d.,\s/o\|liIqtTaeBgOSszZn]{1,2})$"
   :uniq-vis #"Un[il]qu[eP] Por[tf]als [Vv][il]s[il][tl][Pe]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :seer #"Por[tf]als [DO][il]s[cI]ov[eP]r[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$" ;;'Porfals OlsIovPrPd l'
   :xm #"XM Coll[eP][cI][tI][eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+) XM$"
   :hacks #"Ha[cI]ks ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :res-depl #"R[eP]sona[tl]ors [DO][eP]ploy[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :links-created #"L[il]nks Cr[eP]a[tl][eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :fields-created #"Con[tl]rol F[iI][eP]lds Cr[eP]a[tl][eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :mu-captured #"M[il]nd Un[il][tl]s Cap[tl]ur[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?MUs$"
   :longest-link #"Long[eP]s[tl] L[il]nk Ev[eP]r Cr[eP]a[tl][eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?km$"
   :largest-field #"Larg[eP]s[tl] Con[tl]rol F[iI][eP]ld ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?MUs$"
   :recharged-xm #"XM R[eP][cI]harg[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+) XM$"
   :captured #"^Por[tlf]als Cap[tl]ur[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :uniq-captured #"Un[il]qu[eP] Por[tlf]als Cap[tl]ur[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :res-destr #"R[eP]sona[tl]ors [DO][eP]s[tl]roy[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :portals-neutr #"Por[tlf]als N[eP]u[tl]ral[il][zI_][eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$" ;;'Porlals NPulrall_Pd IBT'
   :links-destr #"En[eP]my L[il]nks [DO][eP]s[tl]roy[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :fields-destr #"En[eP]my Con[tl]rol F[iI][eP]lds [DO][eP]s[tl]roy[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :walk #"[DO][il]s[tl]a[nm]*[cm]*[eP] Walk[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?km$" ;;'OlslamP WalkPd 9km'
   :guard-portal #"Max T[il]m[eP] Por[tlf]al H[eP]ld ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?day[S5s]$" ;;'Max TlmP Porlal HPld 14 day5'
   :guard-link #"Max T[il]m[eP] L[il]nk Ma[il]n[tl]a[il]n[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?day[S5s]$"
   :lenght-times-guard-link #"Max L[il]nk L[eP]ng[tl]h x [DO]ays ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?km-day[sS5]$"
   :guard-field #"Max T[il]m[eP] Fi[eP]ld H[eP]ld ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?day[S5s]$"
   :mus-times-guard-field #"Larg[eP]s[tl] F[iI][eP]ld MUs x [DO]ays ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?MU-day[Ss5]$"
   :mods #"Mods [DO][eP]ploy[eP]d ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :uniq-missions #"Un[il]qu[eP] m[il][sS5][sS5][il]on[sS5] completed ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :glyph-points #"Glyph Hack Points ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :links-active #"L[il]nks Active ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :owned-portals #"Por[tlf]als Owned ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :fields-active #"Con[tl]rol F[iI][eP]lds Active ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :mu-control #"M[il]nd Un[il][tl] Control ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?MU[Ss5]$"
   :recruited #"Agents Successfully Recruited ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :mission-days #"Mission Day.s. Attended ([\d.,\s/o\|liIqtTaeBgOSszZ]+)$"
   :longest-hacking-streak #"Longest Hacking Streak ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?day[s5S]$"
   :current-hacking-streak #"Current Hacking Streak ([\d.,\s/o\|liIqtTaeBgOSszZ]+) ?day[s5S]$"
   })

(def pos {:time [:lvl :ap :uniq-vis :seer :xm :walk
                 :res-depl :links-created :fields-created :mu-captured
                 :longest-link :longest-field :recharged-xm :captured :uniq-captured :mods
                 :res-destr :portals-neutr :links-destr :fields-destr
                 :guard-portal :guard-link :lenght-times-guard-link :guard-field :mus-times-guard-field
                 :uniq-missions :mission-days :hacks :glyph-points :longest-hacking-streak :recruited]
          :now [:links-active :owned-portals :fields-active :mu-control :current-hacking-streak]})
