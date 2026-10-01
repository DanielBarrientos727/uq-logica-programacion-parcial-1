/* =================================================================
   SCRIPT.JS - INTERACTIVIDAD Y NAVEGACIÓN
   ================================================================= */

document.addEventListener('DOMContentLoaded', () => {
    // 1. Funcionalidad de Copiar Código
    const copyButtons = document.querySelectorAll('.copy-btn');

    copyButtons.forEach(button => {
        button.addEventListener('click', () => {
            const targetId = button.getAttribute('data-target');
            const preElement = document.getElementById(targetId);

            if (preElement) {
                const codeText = preElement.innerText;
                
                navigator.clipboard.writeText(codeText).then(() => {
                    const originalText = button.innerText;
                    button.innerText = '¡Copiado!';
                    button.style.backgroundColor = 'var(--border-retro)';
                    button.style.color = 'var(--bg-main)';

                    setTimeout(() => {
                        button.innerText = originalText;
                        button.style.backgroundColor = 'transparent';
                        button.style.color = 'var(--text-bright)';
                    }, 2000);
                }).catch(err => {
                    console.error('Error al copiar al portapapeles: ', err);
                });
            }
        });
    });

    // 2. Resaltado de sección activa en la barra de navegación al hacer scroll
    const sections = document.querySelectorAll('section[id], header[id]');
    const navLinks = document.querySelectorAll('.nav-links a');

    window.addEventListener('scroll', () => {
        let current = '';
        const scrollPosition = window.scrollY + 120;

        sections.forEach(section => {
            const sectionTop = section.offsetTop;
            const sectionHeight = section.offsetHeight;

            if (scrollPosition >= sectionTop && scrollPosition < sectionTop + sectionHeight) {
                current = section.getAttribute('id');
            }
        });

        navLinks.forEach(link => {
            link.classList.remove('active');
            if (link.getAttribute('href') === `#${current}`) {
                link.classList.add('active');
            }
        });
    });

    // 3. Desplazamiento suave mejorado para enlaces internos
    navLinks.forEach(link => {
        link.addEventListener('click', (e) => {
            const href = link.getAttribute('href');
            if (href.startsWith('#')) {
                e.preventDefault();
                const targetElement = document.querySelector(href);
                if (targetElement) {
                    const headerOffset = 70;
                    const elementPosition = targetElement.getBoundingClientRect().top;
                    const offsetPosition = elementPosition + window.pageYOffset - headerOffset;

                    window.scrollTo({
                        top: offsetPosition,
                        behavior: 'smooth'
                    });
                }
            }
        });
    });
});
