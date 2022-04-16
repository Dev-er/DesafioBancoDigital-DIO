from setuptools import setup, find_packages

with open("README.md", "r") as f:
    page_description = f.read()

with open("requirements.txt") as f:
    requirements = f.read().splitlines()

setup(
    name="package_imageTest",
    version="0.0.1",
    author="Ubiratan",
    author_email="ubiratantomaz@gmail.com",
    description="Este eh um teste realizado em Pypi, como parte de uma fase do Bootcamp Cognizant_DIO",
    long_description=page_description,
    long_description_content_type="text/markdown",
    url="https://github.com/Dev-er"
    packages=find_packages(),
    install_requires=requirements,
    python_requires='>=2.5',
)